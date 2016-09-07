package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



@RestController
public class GreetingController {

    @RequestMapping("/json")
    public JSONObject readJSONandreturnJSON(@RequestBody String input) {
    	JSONObject json = new JSONObject();
    	try {
	    	JSONParser parser = new JSONParser();
    		json = (JSONObject) parser.parse(input);
    	} catch (Exception e) {
    	}
    return json;
  }
}