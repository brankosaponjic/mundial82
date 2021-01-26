package brankosaponjic.mundial82.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Table(name = "team")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teamId;
    @Enumerated(EnumType.STRING)
    private Country country;

    @OneToMany(mappedBy = "teamId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Manager> managers;

    @OneToMany(mappedBy = "teamId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Player> players;
}