Feature: Oveit hub feature

  @cris
  Scenario: Switch interface language to Korean
    Given Click the "Language" dropdown at the bottom-center of the page
    When Select the "Korean" item
    Then check results
