import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.plcoding.composescreenshottesting.ui.login.LoginScreen
import com.plcoding.composescreenshottesting.ui.theme.ComposeScreenshotTestingTheme
import com.plcoding.screenshottestingexperiment.login.LoginState

@Preview
@Composable
private fun LoginScreenPreview() {
    ComposeScreenshotTestingTheme {
        LoginScreen(
            state = LoginState(),
            onAction = {}
        )
    }
}