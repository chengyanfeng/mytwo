package cheng.beans;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/7/14 0014.
 */
@Component
public class company {
    public String name;
    public String price;
    public int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "company{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", id=" + id +
                '}';
    }
}
