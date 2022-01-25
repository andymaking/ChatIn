package com.king.chatin

import androidx.compose.runtime.Composable

typealias ComposableFun = @Composable () -> Unit

sealed class TabItem(var title: String, var screen: ComposableFun) {
    object Chat : TabItem("Chat", { ChatScreen() })
    object Status : TabItem("Status", { StatusScreen() })
    object Calls : TabItem("Call", { CallScreen() })
}
