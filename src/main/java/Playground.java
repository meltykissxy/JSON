import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;

public class Playground {
    /**
     * 字符串转换为JSON
     */
    @Test
    public void run01() {
        String girl = "{\"name\": \"MeltyKiss\", \"age\":18}";
        JSONObject girlJson = (JSONObject)JSON.parse(girl);
        System.out.println(girlJson.get("name"));
        System.out.println(girlJson.get("age"));
    }
}
