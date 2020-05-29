/*
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.testng.annotations.Test;

import java.util.Iterator;
public class JsonExample {

        @Test
        public void jsonTest(){
            String s="{\"menu\": {\n" +
                    "        \"header\": \"SVG Viewer\",\n" +
                    "        \"items\": [\n" +
                    "        {\"id\": \"Open\"},\n" +
                    "        {\"id\": \"OpenNew\", \"label\": \"Open New\"},\n" +
                    "        null,\n" +
                    "        {\"id\": \"ZoomIn\", \"label\": \"Zoom In\"},\n" +
                    "        {\"id\": \"ZoomOut\", \"label\": \"Zoom Out\"},\n" +
                    "        {\"id\": \"OriginalView\", \"label\": \"Original View\"},\n" +
                    "        null,\n" +
                    "        {\"id\": \"Quality\"},\n" +
                    "        {\"id\": \"Pause\"},\n" +
                    "        {\"id\": \"Mute\"},\n" +
                    "        null,\n" +
                    "        {\"id\": \"Find\", \"label\": \"Find...\"},\n" +
                    "        {\"id\": \"FindAgain\", \"label\": \"Find Again\"},\n" +
                    "    {\"id\": \"Copy\"},\n" +
                    "    {\"id\": \"CopyAgain\", \"label\": \"Copy Again\"},\n" +
                    "    {\"id\": \"CopySVG\", \"label\": \"Copy SVG\"},\n" +
                    "    {\"id\": \"ViewSVG\", \"label\": \"View SVG\"},\n" +
                    "    {\"id\": \"ViewSource\", \"label\": \"View Source\"},\n" +
                    "    {\"id\": \"SaveAs\", \"label\": \"Save As\"},\n" +
                    "    null,\n" +
                    "            {\"id\": \"Help\"},\n" +
                    "    {\"id\": \"About\", \"label\": \"About Adobe CVG Viewer...\"}\n" +
                    "    ]\n" +
                    "}}\n";

            JsonObject jsonObject = new JsonParser().parse(s).getAsJsonObject();
            JsonObject el = jsonObject.get("menu").getAsJsonObject();
            JsonArray a = el.getAsJsonArray("items");
            for(int i=0;i<a.size();i++){
                JsonObject obj = a.get(i).getAsJsonObject();
                String id=obj.get("id").getAsString();
                if(!obj.get("label").getAsString().isEmpty()) {
                    String label = obj.get("label").getAsString();
                }

            }

        }
    }

*/
