# ProgressBarAssignment

Welcome to the ProgressBar Blog wiki!

# Introduction
ProgressBar is a component in Android Studio that lets you see the progress of a certain operation. It is a simple implementation into your project. There are two ways the ProgressBar works the first way is the indeterminate and the second is the determinate. Indeterminate is used when you do not know how long an operation will take and determinate is used when you know how long an operation takes. The progress bar is used for user interface to show the progress of an operation. The two modes are used to show the user how long they have to wait until the process is done. 

# History
The ProgressBar was introduced in API 1 at the very beginning of Android Studio. ProgressBar belongs to the library android.widget.ProgressBar, which derives from android.view.View, which derives from java.land.object. 

# Major methods
Progress Bars can be used in **XML** or the **Java** code. For **XML** you would use this to create a indeterminate progress bar:

```XML
<ProgressBar 
android:id="@+id/progressBar" 
android:layout_width="wrap_content"   
android:layout_height="wrap_content"/>
```

If you know the amount your progress bar has reached and you want to create a determinate progress bar you would use this code:

```XML
<ProgressBar
      android:id="@+id/determinateBar"
      style="@android:style/Widget.ProgressBar.Horizontal"
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      android:progress="31"/>
```


**In the Java code:**

```Java
ProgressBar(Context context);
```

These two can either be used to create a progress bar on the screen.
Other methods that are often used are:

**In Java code:**

`getMax()`- returns the max value of the progress range, default value is 100

**example:** 

```Java

ProgressBar progressBar;
progressBar = (ProgressBar) findViewbyId(R.id.progressBar);
progressBar.getMax();
```

The maximum value will be returned. The default value is 100.

***

`getMin()`- returns the minimum value of the progress range, default value is 0

**Example:**

```Java
ProgressBar progressBar;
progressBar = (ProgressBar) findViewbyId(R.id.progressBar);
progressBar.getMin();
```

The minimum value will be returned. The default value is 0.

***

`setMax(int max)` – sets the maximum value the progress bar can reach

**Example:**

```Java
ProgressBar progressBar;
int max= 70;

progressBar = (ProgressBar) findViewbyId(R.id.progressBar);
progressBar.setMax(max);
```

Then the maximum value returned for the progressBar will be 70.


***

`setMin(int min)` – sets the minimum value for the progress bar where its starts at

**Example:**

```Java
ProgressBar progressBar;
int min= 20;

progressBar = (ProgressBar) findViewbyId(R.id.progressBar);
progressBar.setMin(min);
```

The minimum value will be set to 20.


***

`setProgress(int progress)` – sets the value of the progress for a value specified

**Example:**

```Java
ProgressBar progressBar;
int progress= 20;`

progressBar = (ProgressBar) findViewbyId(R.id.progressBar);
progressBar.setProgress(min);
```

The overall progress of the progressBar will be set to 20.


***


`getProgress()` – gets the progress bars current status

**Example:**

```Java
ProgressBar progressBar;

progressBar = (ProgressBar) findViewbyId(R.id.progressBar);
progressBar.getProgress();
```

The current progress of the progressBar will be returned.

***


**in XML:**

`android:indeterminate` – enables the progress bar to indeterminate mode takes only two values true or false

**example:** 
```XML
<ProgressBar
...

android:indeterminate  = “true” or “false”/>
```

***

`android:max` – sets the max value for the progress bar

**example:** 

```XML
<ProgressBar
...
android:max = “25”/>
```

Then the max value would display 25 instead of the default value 100

***


`android:min` - sets the minimum value for the progress bar

**example:** 
```XML
<ProgressBar
...
android:min = “22”/>
```

Then the minimum value would be 22 instead of the default value 0 

***

`android:progress` – sets the progress value between 0 and a max value

**example:** 

```XML
<ProgressBar
...
android:progress = “65”/>
```

Then the progress displayed will be 0 – 65 instead of the default value 0 – 100

***

# Example Code

The example code provided used the following methods for Java and XML.

The methods used for **Java** are:

`progressBar.setProgress(progressStatus)` - This method was used to set the progress in a loop each time it looped it added 1 to the progressStatus

`progressBar.getMax()` - This method was used to call the maximum value and display it in a TextView for the UI to show the progress taken

# API Reference

Link used: [ProgressBar page on Android Website ](https://developer.android.com/reference/android/widget/ProgressBar.html)
