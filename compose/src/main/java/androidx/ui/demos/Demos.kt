/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.compose.integration.demos



import androidx.animation.AnimationDemos
import androidx.compose.foundation.FoundationDemos
import androidx.compose.foundation.layout.demos.LayoutDemos
import androidx.compose.foundation.text.demos.TextDemos
import androidx.compose.material.MaterialDemos
import androidx.compose.ui.demos.CoreDemos
import androidx.ui.DemoCategory

/**
 * [DemoCategory] containing all the top level demo categories.
 */
val AllDemosCategory = DemoCategory(
    "Jetpack Compose Demos",
    listOf(
        AnimationDemos,
        FoundationDemos,
        CoreDemos,
        LayoutDemos,
        MaterialDemos,

        TextDemos
    )
)