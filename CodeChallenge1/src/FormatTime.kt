fun main(args: Array<String>) {
    println(formatTime(seconds = args[0].toInt()))
}

fun formatTime(seconds: Int = 0): String {
    if (seconds == 0) {
        return "none"
    }

    var remainder = seconds
    var formattedTime = ""
    for (unitTime in TimeUnit.values()) {
        if (remainder > 0) {
            var noUnits = remainder / unitTime.noSeconds
            remainder = remainder % unitTime.noSeconds
            formattedTime += formatUnit(noUnits, unitTime)
        }
    }
    formattedTime = formatTimeString(formattedTime)
    return formattedTime.replace(",", ", ");
}

fun formatUnit(noUnits: Int, Unit: TimeUnit): String {
    if (noUnits == 0) {
        return ""
    }
    if (noUnits > 1) {
        return noUnits.toString() + " " + Unit.unitDescPlural + ","
    } else {
        return noUnits.toString() + " " + Unit.unitDescSingular + ","
    }
}

fun formatTimeString(informattedTime: String) : String {
    //Remove the last comma and change the penultimate comma if applicable to an 'and' finally put the space back after commas
    var formattedTime=inFormattedTime
    var position = formattedTime.lastIndexOf(",")
    if (position != -1) {
        formattedTime = formattedTime.replaceRange(position, position + 1, "")
        position = formattedTime.lastIndexOf(",")
        if (position != -1) {
            formattedTime = formattedTime.replaceRange(position, position + 1, " and ")
        }
    }
    return formattedTime
}

enum class TimeUnit(val noSeconds: Int, val unitDescSingular: String, val unitDescPlural: String) {
    Year(31536000, "year", "years"),
    Day(86400, "day", "days"),
    Hour(3600, "hour", "hours"),
    Minute(60, "minute", "minutes"),
    Second(1, "second", "seconds")
}
