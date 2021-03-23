package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name", nullable = false, length = 20)
    private String name;
    @Column(name = "email", unique = true, nullable = false, length = 254)
    private String email;
    @Column(name = "phone", unique = true, nullable = false, length = 15)
    private Long phone;
    @Column(name = "about")
    private String about;
}
