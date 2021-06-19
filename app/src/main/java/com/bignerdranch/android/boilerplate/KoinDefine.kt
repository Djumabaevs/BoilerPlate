package com.bignerdranch.android.boilerplate

import org.koin.dsl.module

val usecaseModule = module {

    factory {
        RefreshGitHUbReposUseCase(
            appCoroutineDispatchers = get(),
            githubRemoteDepo = get(),
            githubLocalRepo = get()
        )
    }
}

class RefreshGitHUbReposUseCase(appCoroutineDispatchers: Any, githubRemoteDepo: Any, githubLocalRepo: Any) {

}
