data class Category(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String?,
)

data class Ingredient(
    val id: Int,
    val name: String,
)

data class Recipe(
    val id: Int,
    val categoryId: Int,
    val name: String,
    val imageUrl: String?,
    val ingredients: List<RecipeIngredient>,
)

data class RecipeIngredient(
    val recipeId: Int,
    val ingredientId: Int,
    val amount: Double,
    val unit: String,
)