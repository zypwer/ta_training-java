# Practical Task 2

Test case 
"Validate that the user can search for a position based on criteria" on https://www.epam.com/

## Locator Mapping Table

| # | Element | Locator type | Locator |
|---|---------|--------------|---------|
| 1 | "Accept all" button (cookie banner, epam.com) | ID | `By.id("onetrust-accept-btn-handler")` |
| 2 | "Careers" link (top navigation, epam.com) | LinkText | `By.linkText("Careers")` |
| 3 | "Start your search here" button (Careers page) | PartialLinkText | `By.partialLinkText("START YOUR SEARCH")` |
| 4 | "Location" field, selected value "All available countries" | XPath with operators / functions | `//div[@data-testid='dropdown-value' and contains(text(),'All available countries')]` |
| 5 | "Keywords" input | Name | `By.name("search")` |
| 6 | "Remote" checkbox (desktop filters) | XPath with axes | `(//span[text()='Remote']/ancestor::div[1]/input)[1]` |
| 7 | "Search" button | XPath (relative path) | `//div[@data-testid='sticky-element']//button[@data-event-label='search']` |
| 8 | Latest (first) job listing in search results | CSS Selector | `[data-testid='accordion-section-container']` |
| 9 | Job title on the job description page | TagName | `By.tagName("h1")` |
| 10 | "Cookies Settings" button (cookie banner, epam.com) | ClassName | `By.className("cookie-setting-link")` |

### Notes

I guess the site changed since the task was written, there's no "All Locations" option anymore, the location field shows "All available countries" and itss already selected by default
there's also no "View and apply" button, you open the job page just by clicking the job title in the first card
the "Remote" checkbox is in the dom twice, the first one is for desktop version and the second one for mobile
I took the first one, which is for the desktop
findElement returns the first match, so the css locator for job cards gives the latest job, it's the first one in the list
I tried to avoid classes with generated hashes like JobCard_panel__gTD7e(since they can change after any deploy)
used id, name, data-testid and text instead where it was possible
