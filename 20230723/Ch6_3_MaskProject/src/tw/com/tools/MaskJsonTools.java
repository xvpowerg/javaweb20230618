package tw.com.tools;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import tw.com.beans.Mask;

public class MaskJsonTools {
	public static void maskJsonToObj(String json,Consumer<List<Mask>> maskListCallback) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		Map rooMap =  objectMapper.readValue(json, Map.class);
		List<Map<String,Object>> fList =  (List<Map<String,Object>>)rooMap.get("features");
		List<Mask> maskList = new ArrayList();
		
		for (Map<String,Object> dataMap : fList) {
				Map<String,Object> pMap =
						(Map<String,Object>)dataMap.get("properties");
				Mask mask = new Mask();
				mask.setId(pMap.get("id").toString());
				mask.setName(pMap.get("name").toString());
				mask.setMaskAduilt(pMap.get("mask_adult").toString());
				mask.setMaskChild(pMap.get("mask_child").toString());
				maskList.add(mask);
		}
		maskListCallback.accept(maskList);		
	}
	
	public static void main(String[] args) {
		MaskNetTools.downloadMaskJson(json->{
			try {
				MaskJsonTools.maskJsonToObj(json, list->{
					System.out.println(list);					
				});
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
						
		}, ex->{});
	}
}
