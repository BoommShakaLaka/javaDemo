package compareForList;

public class User1 {
    private String id;
    private String name;

    public User1(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        User1 u = (User1) obj;
        return id.equals(u.getId()) && name.equals(u.getName());
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
