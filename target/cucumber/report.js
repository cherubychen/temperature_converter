$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('com\packtpub\mastering\selenium\Conversion.feature');
formatter.feature({
  "line": 1,
  "name": "Convert between different unit of temperatures",
  "description": "\r\nFormula: C/5 \u003d (F - 32) / 9\r\nC \u003d 5(F - 32)/9 \u003d 5(98.6 - 32)/9 \u003d 37",
  "id": "convert-between-different-unit-of-temperatures",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Convert to Celsius from Fahrenheit",
  "description": "",
  "id": "convert-between-different-unit-of-temperatures;convert-to-celsius-from-fahrenheit",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I want to convert 98.6 degree Fahrenheit to Celsius",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I input the value of Fahrenheit as 98.6 in text",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "It should be converted to Celsius as 37 degree",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "98",
      "offset": 18
    },
    {
      "val": "6",
      "offset": 21
    }
  ],
  "location": "ConversionStepDefs.I_want_to_convert_degree_Fahrenheit_to_Celsius(int,int)"
});
formatter.result({
  "duration": 12953119360,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "98",
      "offset": 35
    },
    {
      "val": "6",
      "offset": 38
    }
  ],
  "location": "ConversionStepDefs.I_input_the_value_of_Fahrenheit_as_in_text(int,int)"
});
formatter.result({
  "duration": 1017130608,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "37",
      "offset": 37
    }
  ],
  "location": "ConversionStepDefs.It_should_be_converted_to_Celsius_as_degree(int)"
});
formatter.result({
  "duration": 480828441,
  "status": "passed"
});
});