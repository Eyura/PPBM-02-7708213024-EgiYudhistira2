import com.example.assement.User

object UserManager {
    private val userList = mutableListOf<User>()

    fun registerUser(username: String, password: String): Boolean {
        // Check if the user already exists
        if (isUsernameExists(username)) {
            return false // User already registered
        }

        // Register the new user
        val newUser = User(username, password)
        userList.add(newUser)
        return true
    }

    fun loginUser(username: String, password: String): Boolean {
        // Check if the user exists and the password is correct
        return userList.any { it.username == username && it.password == password }
    }

    fun isUsernameExists(username: String): Boolean {
        // Check if the username already exists in the user list
        return userList.any { it.username == username }
    }
}
