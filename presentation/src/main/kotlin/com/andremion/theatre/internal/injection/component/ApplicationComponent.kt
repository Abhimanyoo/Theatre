/*
 * Copyright (c) 2018. André Mion
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.andremion.theatre.internal.injection.component

import com.andremion.theatre.DaggerApplication
import com.andremion.theatre.internal.injection.module.DataModule
import com.andremion.theatre.internal.injection.module.DomainModule
import com.andremion.theatre.internal.injection.module.PresentationModule
import com.andremion.theatre.internal.injection.module.android.ActivitiesModule
import com.andremion.theatre.internal.injection.module.android.ApplicationModule
import com.andremion.theatre.internal.injection.module.android.FragmentsModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    ActivitiesModule::class,
    FragmentsModule::class,

    ApplicationModule::class,
    PresentationModule::class,
    DomainModule::class,
    DataModule::class])
internal interface ApplicationComponent : AndroidInjector<DaggerApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<DaggerApplication>()
}
