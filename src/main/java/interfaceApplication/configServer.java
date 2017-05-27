package interfaceApplication;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import esayhelper.DBHelper;
import esayhelper.jGrapeFW_Message;

public class configServer extends DBHelper{
	//private db serviceServer;
	public configServer(){
		super("localdb","configs","id");
		//serviceServer = getDB();
	}
	//configString:java.lang.String
	public String configString(String nodeName){
		JSONObject rObject = eq("configName", nodeName).find();
		return rObject == null ? "" : rObject.get("configjson").toString();
	}
	@SuppressWarnings("unchecked")
	public String configPage(int ids,int pageSize) {
		JSONObject obj = new JSONObject();
		JSONArray array = page(ids, pageSize);
		JSONObject object = new JSONObject();
		object.put("totalSize",
				(int) Math.ceil((double)count() / pageSize));
		object.put("currentPage", ids);
		object.put("pageSize", pageSize);
		object.put("data", array);
		obj.put("records", object);
		return jGrapeFW_Message.netMSG(0, obj.toString());
	}
}
