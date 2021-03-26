package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "devices")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String deviceName;
    @Column(unique = true, nullable = false)
    private String IMEI;
    @OneToOne(mappedBy = "device")
    private Player player;
    @OneToMany(mappedBy = "device", fetch = FetchType.EAGER)
    private Set<Game> games;
}
