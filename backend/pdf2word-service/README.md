# KaatibDocsPro PDF-to-Word backend

This service acts as the conversion layer for converting PDF files into Word documents.

## Approach
Use a lightweight Python backend that receives uploaded PDF files and returns a DOCX result.

## Recommended stack
- Python 3.11+
- FastAPI
- python-docx or a PDF-to-Word conversion engine depending on your chosen solution

## Example workflow
1. App uploads PDF to `/convert`
2. Backend runs conversion logic
3. Backend returns output file path or output bytes
4. App saves or previews the converted document

