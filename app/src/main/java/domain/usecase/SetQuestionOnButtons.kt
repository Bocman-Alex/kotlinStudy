package domain.usecase

import android.content.res.ColorStateList
import android.graphics.Color
import com.example.kotlinstudy.databinding.ActivityMainBinding
import domain.models.Question

class SetQuestionOnButtons
{
	internal fun setQuest(ob: Question, binding: ActivityMainBinding)
	{
		binding.queTextView.text = ob.quest

		val allAnswers = listOf(
			ob.correctAnswer,
			ob.firstUnCorrectAnswer,
			ob.secondUnCorrectAnswer,
			ob.thirdUnCorrectAnswer
		).shuffled()

		binding.bFirstAnswer.text = allAnswers[0]
		binding.bSecondAnswer.text = allAnswers[1]
		binding.bThirdAnswer.text = allAnswers[2]
		binding.bFourthAnswer.text = allAnswers[3]


		binding.bFirstAnswer.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFFFFF")))
		binding.bSecondAnswer.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFFFFF")))
		binding.bThirdAnswer.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFFFFF")))
		binding.bFourthAnswer.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFFFFF")))



	}
}