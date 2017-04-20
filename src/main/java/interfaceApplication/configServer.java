package interfaceApplication;

import org.json.simple.JSONObject;

import esayhelper.DBHelper;

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
}
