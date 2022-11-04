# MyResume App

Features
---------
* My profile 
  * picture, name, skill and little bio
  * What I can do for a company.
* Support landscape mode
* Support Tablet phones
* Themeing: The app automatically ajust to system light and dark theme mode.
* Multiple Languages support: The app also support language configurations from the user's device such as: 
  * Ghanaina language (Fanti)
  * Hausa
  * Spanish
  * German
  * French


Libraries used:
--------------------


Upcoming featues
-------------------
* Work experiences
* Personal projects
* Achievements and certificate
* Education
* List professional skills
* Contact information

APK file
----------------


Challenges
------------------
custom drop down feature.

wanted to implement a drop down like feature that'd dop down and up to view and unview my capabilities respectively.
but I was to acheive that with boolean value with mutableStateof(booleanValue).
How?

I created drop down and up vector files in my drawable folder and I used it in my desing, drop down by default.
And used that boolean value to check the states that's when view and unview what I can do for a company.
```
 /** A function that displays my capabilities to a company*/
    private fun myCapabilities(){
        with(binding){
            dropArrow.setOnClickListener {
                expanded = !expanded
                if (expanded){
                    capabilityId.visibility = View.VISIBLE
                    dropArrow.setImageResource(R.drawable.arrow_drop_up_24)
                }else {
                    capabilityId.visibility = View.GONE
                    dropArrow.setImageResource(R.drawable.arrow_drop_down_24)
                }
            }
        }
    }
```
