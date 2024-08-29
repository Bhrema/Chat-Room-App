package br.bhrema.chatroomapp.data

import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

class UserRepository(private val auth: FirebaseAuth,
                     private val firestore: FirebaseFirestore
) {

    suspend fun signUp(email: String, password: String, firstName: String, lastName: String): Result<Boolean> =
        try {
            auth.createUserWithEmailAndPassword(email, password).await()
            val user = User(firstName, lastName, email)
            saveUserToFirestore(user)
            Result.Success(true)
        } catch (e: Exception) {
            Log.e("UserRepository", "Error during sign up", e)
            Result.Error(e)
        }

    suspend fun login(email: String, password: String): Result<Boolean> =
        try {
            auth.signInWithEmailAndPassword(email, password).await()
            Result.Success(true)
        } catch (e: Exception) {
            Log.e("UserRepository", "Error during login", e)
            Result.Error(e)
        }

    private suspend fun saveUserToFirestore(user: User) {
        try {
            firestore.collection("users").document(user.email).set(user).await()
        } catch (e: Exception) {
            Log.e("UserRepository", "Error saving user to Firestore", e)
        }
    }
}