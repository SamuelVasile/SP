import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import java.lang.reflect.*;

import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonBuilder implements Builder{
	private ObjectMapper mapper = new ObjectMapper();
	private HashMap<String, Object> objectmap;
	private Element result;

	public JsonBuilder(String pathtojson){
		try{
			ObjectMapper mapper = new ObjectMapper();
			this.objectmap = this.mapper.readValue(new File(pathtojson), LinkedHashMap.class);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Override
	public Element getResult() {
		return this.result;
	}

	@Override
	public void build() {
		this.result = this.buildSection(this.objectmap);
	}

	@Override
	public Element buildSection(HashMap<String, Object> map) {
		Section s = new Section(map.get("title").toString());
		HashMap<String, Object> children = new HashMap<String, Object>();

		for(Object o : (ArrayList<Object>) map.get("children")){
			children.putAll((Map<? extends String, ? extends Object>) o);

			try{
				JsonBuilder builder = new JsonBuilder("/home/alex/workspace/design-patterns/book.json");
				Method m = JsonBuilder.class.getDeclaredMethod("build" + children.get("class"), HashMap.class);
				
				s.addElement((Element) m.invoke(builder, children));
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}

		return s;
	}

	@Override
	public Element buildParagraph(HashMap<String, Object> map) {
		Paragraph newparagraph =  new Paragraph(map.get("text").toString());

		return newparagraph;
	}

	@Override
	public Element buildImage(HashMap<String, Object> map) {
		Image newimage =  new Image(map.get("url").toString());

		return newimage;
	}

	@Override
	public Element buildProxyImage(HashMap<String, Object> map) {
		ProxyImage newproxyimage =  new ProxyImage(map.get("url").toString());

		return newproxyimage;
	}

	@Override
	public Element buildTable(HashMap<String, Object> map) {
		Table newtable = new Table(map.get("url").toString());

		return newtable;
	}
}