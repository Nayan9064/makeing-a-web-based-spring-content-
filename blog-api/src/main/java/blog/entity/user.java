package blog.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@Table
@NoArgsConstructor
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)



    private int id;
    @Column(name="user name",nullable=false,length=100)


    private String name;
    private String email;
    private String password;
    private String about;





}
