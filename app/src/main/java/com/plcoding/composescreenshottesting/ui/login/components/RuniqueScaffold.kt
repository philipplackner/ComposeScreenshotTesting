package com.plcoding.composescreenshottesting.ui.login.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.plcoding.composescreenshottesting.ui.login.components.GradientBackground

@Composable
fun RuniqueScaffold(
    withGradient: Boolean = true,
    modifier: Modifier = Modifier,
    topBar: @Composable () -> Unit = {},
    floatingActionButton: @Composable () -> Unit = {},
    content: @Composable (PaddingValues) -> Unit = {}
) {
    Scaffold(
        topBar = topBar,
        floatingActionButton = floatingActionButton,
        floatingActionButtonPosition = FabPosition.Center,
        modifier = modifier
    ) { padding ->
        if(withGradient) {
            GradientBackground {
                content(padding)
            }
        } else {
            content(padding)
        }
    }

}