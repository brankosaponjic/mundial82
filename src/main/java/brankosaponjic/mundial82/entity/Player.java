package brankosaponjic.mundial82.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "player")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int playerId;
    private int backNumber;
    private String name;
    @Enumerated(EnumType.STRING)
    private Position position;
    private LocalDate dayOfBirth;
    private int teamId;
}
