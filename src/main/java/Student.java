import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {
    @Id
    private int Sid;
    public int getSid() {
        return Sid;
    }

    public void setSid(int sid) {
        Sid = sid;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public int getSage() {
        return Sage;
    }

    public void setSage(int sage) {
        Sage = sage;
    }

    private String Sname;
    private int Sage;

}