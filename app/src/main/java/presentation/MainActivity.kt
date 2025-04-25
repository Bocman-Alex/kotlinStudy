package presentation

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinstudy.R
import com.example.kotlinstudy.databinding.ActivityMainBinding
import domain.models.Question
import domain.usecase.newQuestionUsecase

class MainActivity : AppCompatActivity()
{
	private lateinit var binding: ActivityMainBinding
	private val newQuestionUsecase = newQuestionUsecase()


	private fun setQuest(ob: Question)
	{
		binding.queTextView.text = ob.quest
		binding.bFirstAnswer.text= ob.correctAnswer
		binding.bSecondAnswer.text=ob.firstUnCorrectAnswer
		binding.bThirdAnswer.text=ob.thirdUnCorrectAnswer
		binding.bFourthAnswer.text=ob.secondUnCorrectAnswer
	}

	override fun onCreate(savedInstanceState: Bundle?)
	{
		super.onCreate(savedInstanceState)
		binding = ActivityMainBinding.inflate(layoutInflater)
		setContentView(binding.root)


		setQuest(newQuestionUsecase.execute())

		binding.bNext.setOnClickListener { setQuest(newQuestionUsecase.execute()) }


	}
}