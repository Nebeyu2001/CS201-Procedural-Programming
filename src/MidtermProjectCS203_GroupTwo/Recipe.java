package MidtermProjectCS203_GroupTwo;

public class Recipe implements Cloneable {

    private String recipeName;
    private String ingredients;
    private String instructions;
    private int prepTime;
    private int cookTime;
    private int servings;

    public Recipe() {
        recipeName ="pasta alfredo";
        ingredients ="pasta, alfredo sauce, cheese";
        instructions = "just mix together";
        prepTime = 20;
        cookTime = 15;
        servings = 4;

    }

    public Recipe(String recipeName, String ingredients, String instructions, int prepTime, int cookTime, int servings) {
        this.recipeName = recipeName;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.prepTime = prepTime;
        this.cookTime = cookTime;
        this.servings = servings;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public int getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(int prepTime) {
        this.prepTime = prepTime;
    }

    public int getCookTime() {
        return cookTime;
    }

    public void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Recipe cloned = (Recipe) super.clone();
        return cloned;
       // return (Recipe) super.clone();
    }

    @Override
    public String toString() {
        return
                ", recipeName='" + recipeName + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", instructions='" + instructions + '\'' +
                ", prepTime=" + prepTime +
                ", cookTime=" + cookTime +
                ", servings=" + servings;
    }
}
