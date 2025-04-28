package domain.usecase

import android.content.Context
import android.util.Log
import com.google.gson.Gson
import domain.models.Question
import java.io.File
import java.io.InputStreamReader


class NewQuestionUsecase(private val context: Context)
{
	private var questions: List<Question> = emptyList()

	init
	{
		loadQuestionsFromAssets()
	}

	private fun loadQuestionsFromAssets()
	{
		try
		{


			val inputStream = context.assets.open("questions.json")
			Log.d("logDebug", "input")

			val json = InputStreamReader(inputStream).use { it.readText() }
			Log.d("logDebug", "json")




			questions = Gson().fromJson(json, Array<Question>::class.java).toList()
			Log.d("logDebug", "Questions loaded successfully: ${questions.size} questions.")


		} catch (e: Exception)
		{
			e.printStackTrace()

			questions = listOf(
				Question(
					quest = "G?",
					correctAnswer = "Y",
					firstUnCorrectAnswer = "no",
					secondUnCorrectAnswer = "never",
					thirdUnCorrectAnswer = "not"
				)
			)
		}
	}

	fun constructQuestion(): Question
	{
		return questions.random()
	}
}