package entities;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @ToString
@Table(name="cours")
public class Cours {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String coursName;
	@ManyToOne
	@JoinColumn(name="IdAdmin", nullable=false)
	private Teachers teacherName;
	@ManyToMany
    @JoinTable( name = "T_Cours_Students_Associations",
                joinColumns = @JoinColumn( name = "idCours" ),
                inverseJoinColumns = @JoinColumn( name = "idStudent" ) )
    private List<Students> users = new ArrayList<>();
            



	

}
