John Lewis coding challenge #1
We need to tell customers when our next big marketing event is starting.


Your task is to create a function called formatTime that accepts an integer which represents a time in seconds and returns a string which represents the time in a more readable format. The time will be zero or larger.


For example:


formatTime(1) should return 1 second

formatTime(62) should return 1 minute and 2 seconds

formatTime(3662) should return a time of 1 hour, 1 minute and 2 seconds


Other valid results include:

3 years and 24 minutes

3 days, 4 hours and 1 minute


The format must be precise:

If there is more than one time component then last two components must be separated by “ and “, i.e. the word “and” with a leading and trailing space, and other time components must be separated by “, “, i.e. a comma with a trailing space.

Higher order time units should appear first, e.g. years must appear before days.

A year always has 365 days.

Time units/values should only be included in the output if values are greater than zero.

Seconds must not be larger than 59, minutes must not be larger than 59, an hour must not be larger than 23, and days must not be larger than 364. 

If the time is zero then return a string containing “none”.

To run:

Run in IntelliJ specifying an integer which represents time in the Program Arguments (Configurations from the Run menu)
