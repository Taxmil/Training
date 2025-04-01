import { bootstrapApplication } from '@angular/platform-browser';
import { provideRouter, Routes } from '@angular/router';
import { AppComponent } from './app/app.component';
import { AnimeListComponent } from './components/anime-list/anime-list.component';
import { AnimeDetailComponent } from './components/anime-detail/anime-detail.component';
import { EnquiryFormComponent } from './components/enquiry-form/enquiry-form.component';

const routes: Routes = [
  { path: '', component: AnimeListComponent },
  { path: 'anime/:id', component: AnimeDetailComponent },
  { path: 'enquiry', component: EnquiryFormComponent }
];

bootstrapApplication(AppComponent, {
  providers: [provideRouter(routes)]
});
