package role;

import equipment.Mount;
import profession.Profession;

public abstract class Role {
    private Profession prof;
    private Mount mount;
    void setProfession(Profession prof) {
        this.prof = prof;
    }

    void setMount(Mount mount) {
        this.mount = mount;
    }
}
