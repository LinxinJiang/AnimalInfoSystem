import java.util.HashMap;

public class IdAndPassword {

    HashMap<String,String> loginInfo = new HashMap<>();

    IdAndPassword(){
        loginInfo.put("WePets","123");
    }

    protected HashMap getLoginInfo(){
        return loginInfo;
    }

}
