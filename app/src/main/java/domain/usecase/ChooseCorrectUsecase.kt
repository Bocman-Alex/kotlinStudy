package domain.usecase

import android.content.Context
import android.widget.Toast


class ChooseCorrectUsecase
{
	internal fun equals(str: String, context:Context,str2: String)
	{
		val message = if (str == str2) "correctAnswer" else "unCorrectAnswer"
		Toast.makeText(context, message, Toast.LENGTH_SHORT).show()


	}
}