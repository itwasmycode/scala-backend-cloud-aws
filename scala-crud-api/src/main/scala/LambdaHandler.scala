import com.amazonaws.services.lambda.runtime.Context

object YourScalaLambdaFunction {
  // Define your AWS Lambda handler function here
  def handler(event: String, context: Context): String = {
    // Your Lambda function logic goes here
    "Hello, Lambda crud!"
  }
}
