

<h1>Injeção de Dependências utilizando o Hilt</h1>


<h1>O que é o Hilt?</h1>

Hilt é uma biblioteca para injeção de dependências através de anotações , que ajuda a reduzir escrita de código verboso, evitando assim o boilerplate
O Hilt descende da famosa biblioteca Dagger, se aproveitando de seu desempenho e suporte ao Android Studio.
As anotações e funções fornecem dependências em módulos e constróem fábricas. Tudo isso em um  escopo vinculado ao ciclo de vida no nível do aplicativo.

Adicione o plugin hilt-android-gradle-plugin ao arquivo  build.gradle </br>

buildscript {</br>
    ...</br>
    dependencies {</br>
        ...</br>
        classpath 'com.google.dagger:hilt-android-gradle-plugin:2.28-alpha'</br>
    }</br>
}</br>

Agora aplique o plugin e as dependências no arquivo  app/build.gradle </br>
...</br>
apply plugin: 'kotlin-kapt'</br>
apply plugin: 'dagger.hilt.android.plugin'</br>
android {</br>
    ...</br>
}</br>
dependencies {</br>
    implementation "com.google.dagger:hilt-android:2.28-alpha"</br>
    kapt "com.google.dagger:hilt-android-compiler:2.28-alpha"</br>
}</br>
Como o Hilt utiliza recursos do Java 8, será necessário ativar o mesmo em seu projeto.</br>
Abra o arquivo  app/build.gradle e adicione o seguinte:</br>
android {</br>
  ...</br>
  compileOptions {</br>
    sourceCompatibility JavaVersion.VERSION_1_8</br>
    targetCompatibility JavaVersion.VERSION_1_8</br>
  }</br>
}</br>
</br>
<h1>Injetando objetos  ViewModel utilizando a anotação @ViewModelInject</h1>

Para trabalhar com ViewModels será necessário antes, adicionar as seguintes dependências ao arquivo app/build.gradle :</br>
...
dependencies {</br>
  ...</br>
  implementation 'androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha01'</br>
  kapt 'androidx.hilt:hilt-compiler:1.0.0-alpha01'</br>
 '</br>
}</br>


<h1>Recebendo uma instância  ViewModel através de  extensões KTX</h1></br>

private val viewModel: MyViewModel by viewModels()




