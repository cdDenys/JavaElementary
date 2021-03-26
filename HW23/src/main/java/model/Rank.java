package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ranks")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Rank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String rank;
    @ManyToMany(mappedBy = "ranks")
    private Set<Player> players;
}
