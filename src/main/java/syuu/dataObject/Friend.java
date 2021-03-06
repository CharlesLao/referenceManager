package syuu.dataObject;


import javax.persistence.*;

@Entity
@Table(name="friend")
public class Friend {
    @Id
    @GeneratedValue
    private int id;
    private int userId;
    private int friendId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getFriendId() {
        return friendId;
    }

    public void setFriendId(int friendId) {
        this.friendId = friendId;
    }
}
