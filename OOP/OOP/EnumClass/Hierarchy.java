package EnumClass;

import Annotation.Fancy;

@Fancy (name = "Member", tags = {"Reguler", "Silver", "Gold"})
public enum Hierarchy {
    /*
     * originally, we don't have to call the constructor on the enum member (with condition that there is no constructor inside of the enum)
     * but when there is constructor inside of the enum,
     * we must call the constructor directly right after we make enum member(Ex: in this case = reguler, silver, gold)
     */
    REGULER("Reguler Member"),
    SILVER("Silver Member"),
    GOLD("Gold Member"); 
    /*
     * originally we don't add semicolon on the end of enum (just let it empty). 
     * but when there is another member, we have to end it with semicolon.
     */ 

    private String description;

    Hierarchy(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}


