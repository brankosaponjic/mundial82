package brankosaponjic.mundial82.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "manager")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int managerId;
    private String name;
    private LocalDate dayOfBirth;
    private int teamId;


}
