# Google Photos Public Feedback Dataset — 2,000 unique records

Generated: 2026-10-06

## Files
- Google_Photos_Public_Feedback_2000_Unique.csv — combined dataset
- Google_Play_719.csv — 719 public Google Play reviews
- Apple_App_Store_500.csv — 500 public Apple App Store reviews
- YouTube_719.csv — 719 public YouTube comments
- Reddit_62.csv — 62 source-linked, exact-text-unique Google Photos / Ask Photos Reddit evidence records

## Integrity rules
- Synthetic/showcase/augmentation Reddit rows were excluded.
- Exact normalized feedback text was deduplicated globally across the 2,000 selected records.
- Age, gender, and user location were not inferred. They are marked not_public_or_not_collected.
- Google Play was stratified across 1–5 star ratings and spread across dates.
- YouTube rows require a public comment id and obvious multi-link promotional rows were excluded.
- Reddit count is lower because only 62 exact-text-unique Google Photos/Ask Photos records passed the verified source-linked filter. No fake rows were added to force equal platform counts.

## Public source snapshots
- https://github.com/gvs9/Google_photos_discoveryengine
- https://github.com/ScriptSavvvy/GRAD_PROJECT

Note: Public source content can be edited/deleted later at the original platform. Source URLs and source item IDs are retained where available.
