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

	private val chooseCorrectUsecase = ChooseCorrectUsecase()
	private val setQuestionOnButtons = SetQuestionOnButtons()


	override fun onCreate(savedInstanceState: Bundle?)
	{
		super.onCreate(savedInstanceState)
		binding = ActivityMainBinding.inflate(layoutInflater)
		setContentView(binding.root)

		val newQuestionUsecase = NewQuestionUsecase(this)


		
		var question = newQuestionUsecase.constructQuestion()


		setQuestionOnButtons.setQuest(question, binding)


		binding.bNext.setOnClickListener {
			question = newQuestionUsecase.constructQuestion()
			setQuestionOnButtons.setQuest(question, binding)

		}


		binding.bFirstAnswer.setOnClickListener {
			chooseCorrectUsecase.equals(
				binding.bFirstAnswer.text.toString(),

				question.correctAnswer,
				binding.bFirstAnswer
			)
		}
		binding.bSecondAnswer.setOnClickListener {
			chooseCorrectUsecase.equals(
				binding.bSecondAnswer.text.toString(),

				question.correctAnswer,
				binding.bSecondAnswer
			)
		}
		binding.bThirdAnswer.setOnClickListener {
			chooseCorrectUsecase.equals(
				binding.bThirdAnswer.text.toString(),

				question.correctAnswer,
				binding.bThirdAnswer
			)
		}
		binding.bFourthAnswer.setOnClickListener {
			chooseCorrectUsecase.equals(
				binding.bFourthAnswer.text.toString(),

				question.correctAnswer,
				binding.bFourthAnswer
			)
		}

	}
}