package top.pluto.datingapp;

/**
 * @ProjectName DatingApp
 * @ClassName cards
 * @Author renhaozhang
 * @Date 2021-04-22 12:25 AM
 **/
public class cards {
    private String userId;
    private String name;

    public cards(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
