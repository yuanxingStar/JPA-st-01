package org.yuanxing.jpa.st01;

import java.io.Serializable;
import javax.persistence.*;

/**
 * @author yuanxing
 * @create 2019-07-25 13:59
 * @see
 *
 *  （1）setting->inspectiongs->JPA 
 *      This inspection controls whether the Persistence ORM annotations are checked against configured Datasources
 */

@Table(name="JPA_CUTOMERS1")
@Entity
public class Customer implements Serializable {

    private Integer id;
    private String lastName;

    private String email;
    private int age;

    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name="LAST_NAME",length=50,nullable=false)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
