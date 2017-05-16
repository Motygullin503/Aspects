package myproject.entities;


import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "methods")
public class Method implements Serializable{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", unique = true, nullable = false)
        private Integer id = -1;

        @Size(min = 1, max = 255)
        @Column
        private String name;


        @Column
        private Timestamp time;

        @Column
        private String description;

        public Method(){}
        public Method(String name, String description, Timestamp time) {
            this.name = name;
            this.description = description;
            this.time = time;
        }


        @Override
        public int hashCode() {
            int hash = 3;
            hash = 41 * hash + this.id;
            hash = 41 * hash + Objects.hashCode(this.name);
            hash = 41 * hash + Objects.hashCode(this.description);
            hash = 41 * hash + Objects.hashCode(this.time);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Method other = (Method) obj;
            if (this.id != other.id) {
                return false;
            }
            if (!Objects.equals(this.name, other.name)) {
                return false;
            }
            if (!Objects.equals(this.description, other.description)) {
                return false;
            }
            if (!Objects.equals(this.time, other.time)) {
                return false;
            }


            return true;
        }
}
