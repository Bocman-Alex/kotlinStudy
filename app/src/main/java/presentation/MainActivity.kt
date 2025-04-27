package presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinstudy.databinding.ActivityMainBinding
import domain.usecase.ChooseCorrectUsecase
import domain.usecase.NewQuestionUsecase
import domain.usecase.SetQuestionOnButtons

class MainActivity : AppCompatActivity()
{

	private lateinit var binding: ActivityMainBinding
	private val newQuestionUsecase = NewQuestionUsecase()
	private val chooseCorrectUsecase = ChooseCorrectUsecase()
	private val setQuestionOnButtons = SetQuestionOnButtons()


	override fun onCreate(savedInstanceState: Bundle?)
	{
		super.onCreate(savedInstanceState)
		binding = ActivityMainBinding.inflate(layoutInflater)
		setContentView(binding.root)

		val context = this
		var question = newQuestionUsecase.constructQuestion()


		setQuestionOnButtons.setQuest(question, binding)


		binding.bNext.setOnClickListener {
			question = newQuestionUsecase.constructQuestion()
			setQuestionOnButtons.setQuest(question, binding)
		}


		binding.bFirstAnswer.setOnClickListener {
			chooseCorrectUsecase.equals(
				binding.bFirstAnswer.text.toString(),
				context,
				question.correctAnswer
			)
		}
		binding.bSecondAnswer.setOnClickListener {
			chooseCorrectUsecase.equals(
				binding.bSecondAnswer.text.toString(),
				context,
				question.correctAnswer
			)
		}
		binding.bThirdAnswer.setOnClickListener {
			chooseCorrectUsecase.equals(
				binding.bThirdAnswer.text.toString(),
				context,
				question.correctAnswer
			)
		}
		binding.bFourthAnswer.setOnClickListener {
			chooseCorrectUsecase.equals(
				binding.bFourthAnswer.text.toString(),
				context,
				question.correctAnswer
			)
		}

	}
}