package estudos.poo.composicao.entities;

import java.time.LocalDate;

import static estudos.poo.composicao.application.Main.formatterDate;

public class Client {
    private String name;
    private String email;
    private LocalDate birthDate;

    public Client(String name, String email, String birthDate) {
        this.name = name;
        this.email = email;
        setBirthDate(birthDate) ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = LocalDate.parse(birthDate, formatterDate);
    }

    @Override
    public String toString() {
        return "Client: "
                + name
                + " (" + birthDate.format(formatterDate) + ") - "
                + email;
    }
}
